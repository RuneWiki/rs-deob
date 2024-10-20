package deob;

@ObfuscatedName("m")
public class class70 extends class7 {

    @ObfuscatedName("m.d")
    public int field1023;

    @ObfuscatedName("m.b")
    public int[] field1017;

    @ObfuscatedName("m.c")
    public int[] field1016;

    @ObfuscatedName("m.m")
    public int field1019;

    @ObfuscatedName("m.i")
    public String[] field1027;

    @ObfuscatedName("m.v")
    public static class75 field1018 = new class75(128);

    @ObfuscatedName("m.z")
    public int field1015;

    @ObfuscatedName("m.x")
    public int field1021;

    @ObfuscatedName("fs.v(II)Lm;")
    public static class70 method121(int arg0) {
        class70 var1 = (class70) field1018.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field246.method1298(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class70 var3 = new class70();
        class28 var4 = new class28(var2);
        var4.field303 = var4.field306.length - 12;
        int var5 = var4.method504();
        var3.field1019 = var4.method349();
        var3.field1015 = var4.method349();
        var3.field1021 = var4.method349();
        var3.field1023 = var4.method349();
        var4.field303 = 0;
        var4.method319();
        var3.field1016 = new int[var5];
        var3.field1017 = new int[var5];
        var3.field1027 = new String[var5];
        int var6 = 0;
        while (var4.field303 < var4.field306.length - 12) {
            int var7 = var4.method349();
            if (var7 == 3) {
                var3.field1027[var6] = var4.method451();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field1017[var6] = var4.method450();
            } else {
                var3.field1017[var6] = var4.method504();
            }
            var3.field1016[var6++] = var7;
        }
        field1018.method1184(var3, (long) arg0);
        return var3;
    }
}
