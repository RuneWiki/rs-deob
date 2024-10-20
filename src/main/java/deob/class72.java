package deob;

@ObfuscatedName("bt")
public class class72 extends class407 {

    @ObfuscatedName("bt.c")
    public static class257 field970 = new class257(128);

    @ObfuscatedName("bt.p")
    public String field968;

    @ObfuscatedName("bt.f")
    public int[] field971;

    @ObfuscatedName("bt.n")
    public int[] field974;

    @ObfuscatedName("bt.k")
    public String[] field972;

    @ObfuscatedName("bt.w")
    public int field973;

    @ObfuscatedName("bt.s")
    public int field977;

    @ObfuscatedName("bt.q")
    public int field975;

    @ObfuscatedName("bt.m")
    public int field969;

    @ObfuscatedName("bt.x")
    public class421[] field976;

    @ObfuscatedName("dj.c(IB)Lbt;")
    public static class72 method2734(int arg0) {
        class72 var1 = (class72) field970.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1357.method5499(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method4539(var2);
            field970.method4781(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gg.p(IIIB)Lbt;")
    public static class72 method4085(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class72 var5 = method2792(var3, arg0);
        if (var5 == null) {
            int var6 = class309.method4289(arg2, arg0);
            class72 var7 = method2792(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("dt.f(III)Lbt;")
    public static class72 method2792(int arg0, int arg1) {
        class72 var2 = (class72) field970.method4789((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1357.method5482(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1357.method5454(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = method4539(var5);
            if (var6 != null) {
                field970.method4781(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("hy.n([BB)Lbt;")
    public static class72 method4539(byte[] arg0) {
        class72 var1 = new class72();
        class445 var2 = new class445(arg0);
        var2.field4735 = var2.field4733.length - 2;
        int var3 = var2.method7198();
        int var4 = var2.field4733.length - 2 - var3 - 12;
        var2.field4735 = var4;
        int var5 = var2.method7201();
        var1.field973 = var2.method7198();
        var1.field977 = var2.method7198();
        var1.field975 = var2.method7198();
        var1.field969 = var2.method7198();
        int var6 = var2.method7196();
        if (var6 > 0) {
            var1.field976 = var1.method2021(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7198();
                class421 var9 = new class421(var8 > 0 ? class273.method2989(var8) : 1);
                var1.field976[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method7201();
                    int var11 = var2.method7201();
                    var9.method6918(new class411(var11), (long) var10);
                }
            }
        }
        var2.field4735 = 0;
        var1.field968 = var2.method7205();
        var1.field971 = new int[var5];
        var1.field974 = new int[var5];
        var1.field972 = new String[var5];
        int var12 = 0;
        while (var2.field4735 < var4) {
            int var13 = var2.method7198();
            if (var13 == 3) {
                var1.field972[var12] = var2.method7206();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field974[var12] = var2.method7196();
            } else {
                var1.field974[var12] = var2.method7201();
            }
            var1.field971[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bt.k(II)[Lpq;")
    public class421[] method2021(int arg0) {
        return new class421[arg0];
    }
}
