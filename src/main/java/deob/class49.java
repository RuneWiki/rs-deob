package deob;

@ObfuscatedName("at")
public class class49 extends class151 {

    @ObfuscatedName("at.d")
    public static class146 field945 = new class146(128);

    @ObfuscatedName("at.c")
    public int[] field931;

    @ObfuscatedName("at.n")
    public int[] field932;

    @ObfuscatedName("at.q")
    public String[] field933;

    @ObfuscatedName("at.t")
    public int field934;

    @ObfuscatedName("at.p")
    public int field944;

    @ObfuscatedName("at.u")
    public int field936;

    @ObfuscatedName("at.z")
    public int field937;

    @ObfuscatedName("at.l")
    public class143[] field938;

    @ObfuscatedName("ah.d(II)Lat;")
    public static class49 method892(int arg0) {
        class49 var1 = (class49) field945.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1715.method3129(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class130 var4 = new class130(var2);
        var4.field1956 = var4.field1955.length - 2;
        int var5 = var4.method2232();
        int var6 = var4.field1955.length - 2 - var5 - 12;
        var4.field1956 = var6;
        int var7 = var4.method2246();
        var3.field934 = var4.method2232();
        var3.field944 = var4.method2232();
        var3.field936 = var4.method2232();
        var3.field937 = var4.method2232();
        int var8 = var4.method2379();
        if (var8 > 0) {
            var3.field938 = var3.method882(var8);
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var4.method2232();
                class143 var11 = new class143(class134.method595(var10));
                var3.field938[var9] = var11;
                while (var10-- > 0) {
                    int var12 = var4.method2246();
                    int var13 = var4.method2246();
                    var11.method2567(new class155(var13), (long) var12);
                }
            }
        }
        var4.field1956 = 0;
        var4.method2236();
        var3.field931 = new int[var7];
        var3.field932 = new int[var7];
        var3.field933 = new String[var7];
        int var14 = 0;
        while (var4.field1956 < var6) {
            int var15 = var4.method2232();
            if (var15 == 3) {
                var3.field933[var14] = var4.method2314();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var3.field932[var14] = var4.method2379();
            } else {
                var3.field932[var14] = var4.method2246();
            }
            var3.field931[var14++] = var15;
        }
        field945.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.c(II)[Leb;")
    public class143[] method882(int arg0) {
        return new class143[arg0];
    }
}
