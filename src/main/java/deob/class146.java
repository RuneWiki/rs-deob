package deob;

@ObfuscatedName("ef")
public class class146 extends class196 {

    @ObfuscatedName("ef.j")
    public class133[] field2152;

    @ObfuscatedName("a.j(Lia;Lia;IZI)Lef;")
    public static class146 method93(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3783(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3780(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3780(0, var8);
                } else {
                    var9 = arg1.method3780(var8, 0);
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
            return new class146(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class146(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        class195 var5 = new class195();
        int var6 = arg0.method3784(arg2);
        this.field2152 = new class133[var6];
        int[] var7 = arg0.method3783(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3773(arg2, var7[var8]);
            class140 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class140 var12 = (class140) var5.method3326(); var12 != null; var12 = (class140) var5.method3323()) {
                if (var12.field2057 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3780(0, var11);
                } else {
                    var13 = arg1.method3780(var11, 0);
                }
                var10 = new class140(var11, var13);
                var5.method3317(var10);
            }
            this.field2152[var7[var8]] = new class133(var9, var10);
        }
    }

    @ObfuscatedName("ef.h(IB)Z")
    public boolean method2671(int arg0) {
        return this.field2152[arg0].field1901;
    }
}
