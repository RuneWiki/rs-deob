package deob;

@ObfuscatedName("dm")
public class class81 extends class500 {

    @ObfuscatedName("dm.ak")
    public static class312 field1018 = new class312(128);

    @ObfuscatedName("dm.al")
    public String field1020;

    @ObfuscatedName("dm.aj")
    public int[] field1019;

    @ObfuscatedName("dm.az")
    public int[] field1024;

    @ObfuscatedName("dm.af")
    public String[] field1021;

    @ObfuscatedName("dm.aa")
    public int field1022;

    @ObfuscatedName("dm.at")
    public int field1023;

    @ObfuscatedName("dm.ab")
    public int field1025;

    @ObfuscatedName("dm.ac")
    public int field1028;

    @ObfuscatedName("dm.ao")
    public class519[] field1026;

    @ObfuscatedName("gz.ak(II)Ldm;")
    public static class81 method3327(int arg0) {
        class81 var1 = (class81) field1018.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4783.method6573(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class81 var3 = method2358(var2);
            field1018.method5564(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ae.al(IIII)Ldm;")
    public static class81 method175(int arg0, int arg1, int arg2) {
        int var3 = class376.method5038(arg1, arg0);
        class81 var4 = method1878(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class376.method3175(arg2, arg0);
        class81 var6 = method1878(var5, arg0);
        if (var6 == null) {
            int var7 = class376.method5191(arg0);
            class81 var8 = method1878(var7, arg0);
            return var8 == null ? null : var8;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("cy.aj(IIB)Ldm;")
    public static class81 method1878(int arg0, int arg1) {
        class81 var2 = (class81) field1018.method5570((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field4783.method6587(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field4783.method6577(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class81 var6 = method2358(var5);
            if (var6 != null) {
                field1018.method5564(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("di.az([BI)Ldm;")
    public static class81 method2358(byte[] arg0) {
        class81 var1 = new class81();
        class546 var2 = new class546(arg0);
        var2.field5344 = var2.field5346.length - 2;
        int var3 = var2.method8798();
        int var4 = var2.field5346.length - 2 - var3 - 12;
        var2.field5344 = var4;
        int var5 = var2.method8801();
        var1.field1022 = var2.method8798();
        var1.field1023 = var2.method8798();
        var1.field1025 = var2.method8798();
        var1.field1028 = var2.method8798();
        int var6 = var2.method8796();
        if (var6 > 0) {
            var1.field1026 = var1.method2118(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8798();
                class519 var9 = new class519(var8 > 0 ? Statics.method4498(var8) : 1);
                var1.field1026[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8801();
                    int var11 = var2.method8801();
                    var9.method8513(new class503(var11), (long) var10);
                }
            }
        }
        var2.field5344 = 0;
        var1.field1020 = var2.method8805();
        var1.field1019 = new int[var5];
        var1.field1024 = new int[var5];
        var1.field1021 = new String[var5];
        int var12 = 0;
        while (var2.field5344 < var4) {
            int var13 = var2.method8798();
            if (var13 == 3) {
                var1.field1021[var12] = var2.method8806();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1024[var12] = var2.method8796();
            } else {
                var1.field1024[var12] = var2.method8801();
            }
            var1.field1019[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dm.af(IB)[Ltu;")
    public class519[] method2118(int arg0) {
        return new class519[arg0];
    }
}
