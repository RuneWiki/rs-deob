package deob;

@ObfuscatedName("ep")
public class class151 extends class142 {

    @ObfuscatedName("ep.n")
    public static class100 field2262 = new class100(128);

    @ObfuscatedName("ep.j")
    public int[] field2261;

    @ObfuscatedName("ep.z")
    public int[] field2260;

    @ObfuscatedName("ep.g")
    public String[] field2264;

    @ObfuscatedName("ep.q")
    public int field2263;

    @ObfuscatedName("ep.i")
    public int field2265;

    @ObfuscatedName("ep.s")
    public int field2266;

    @ObfuscatedName("ep.u")
    public int field2267;

    @ObfuscatedName("bq.z(II)Lep;")
    public static class151 method872(int arg0) {
        class151 var1 = (class151) field2262.method1244((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1232.method1044(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class151 var3 = new class151();
        class135 var4 = new class135(var2);
        var4.field1729 = var4.field1732.length - 12;
        int var5 = var4.method1605();
        var3.field2263 = var4.method1602();
        var3.field2265 = var4.method1602();
        var3.field2266 = var4.method1602();
        var3.field2267 = var4.method1602();
        var4.field1729 = 0;
        var4.method1671();
        var3.field2261 = new int[var5];
        var3.field2260 = new int[var5];
        var3.field2264 = new String[var5];
        int var6 = 0;
        while (var4.field1729 < var4.field1732.length - 12) {
            int var7 = var4.method1602();
            if (var7 == 3) {
                var3.field2264[var6] = var4.method1693();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field2260[var6] = var4.method1600();
            } else {
                var3.field2260[var6] = var4.method1605();
            }
            var3.field2261[var6++] = var7;
        }
        field2262.method1246(var3, (long) arg0);
        return var3;
    }
}
