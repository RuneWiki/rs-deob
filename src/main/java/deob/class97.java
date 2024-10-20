package deob;

@ObfuscatedName("ct")
public class class97 extends class219 {

    @ObfuscatedName("ct.d")
    public static class213 field1440 = new class213(128);

    @ObfuscatedName("ct.z")
    public int[] field1446;

    @ObfuscatedName("ct.n")
    public int[] field1449;

    @ObfuscatedName("ct.r")
    public String[] field1441;

    @ObfuscatedName("ct.e")
    public int field1442;

    @ObfuscatedName("ct.y")
    public int field1443;

    @ObfuscatedName("ct.k")
    public int field1444;

    @ObfuscatedName("ct.s")
    public int field1445;

    @ObfuscatedName("ct.p")
    public class210[] field1447;

    @ObfuscatedName("ck.d(II)Lct;")
    public static class97 method1748(int arg0) {
        class97 var1 = (class97) field1440.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field9.method4273(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class97 var3 = method915(var2);
            field1440.method3697(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("cf.z(ILir;B)Lct;")
    public static class97 method1887(int arg0, class246 arg1) {
        class97 var2 = (class97) field1440.method3707((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field9.method4290(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field9.method4280(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class97 var6 = method915(var5);
            if (var6 != null) {
                field1440.method3697(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bf.n([BB)Lct;")
    public static class97 method915(byte[] arg0) {
        class97 var1 = new class97();
        class195 var2 = new class195(arg0);
        var2.field2568 = var2.field2569.length - 2;
        int var3 = var2.method3269();
        int var4 = var2.field2569.length - 2 - var3 - 12;
        var2.field2568 = var4;
        int var5 = var2.method3264();
        var1.field1442 = var2.method3269();
        var1.field1443 = var2.method3269();
        var1.field1444 = var2.method3269();
        var1.field1445 = var2.method3269();
        int var6 = var2.method3330();
        if (var6 > 0) {
            var1.field1447 = var1.method1889(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3269();
                class210 var9 = new class210(var8 > 0 ? class200.method54(var8) : 1);
                var1.field1447[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3264();
                    int var11 = var2.method3264();
                    var9.method3666(new class224(var11), (long) var10);
                }
            }
        }
        var2.field2568 = 0;
        var2.method3267();
        var1.field1446 = new int[var5];
        var1.field1449 = new int[var5];
        var1.field1441 = new String[var5];
        int var12 = 0;
        while (var2.field2568 < var4) {
            int var13 = var2.method3269();
            if (var13 == 3) {
                var1.field1441[var12] = var2.method3268();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1449[var12] = var2.method3330();
            } else {
                var1.field1449[var12] = var2.method3264();
            }
            var1.field1446[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ct.r(II)[Lhd;")
    public class210[] method1889(int arg0) {
        return new class210[arg0];
    }
}
