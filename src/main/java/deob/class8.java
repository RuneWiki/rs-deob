package deob;

@ObfuscatedName("i")
public class class8 {

    @ObfuscatedName("i.p")
    public static boolean field239 = false;

    @ObfuscatedName("i.m")
    public static boolean field235 = false;

    @ObfuscatedName("i.e")
    public static boolean field236 = false;

    @ObfuscatedName("i.t")
    public static class12 field234 = class12.field275;

    @ObfuscatedName("i.w")
    public static class192 field238 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.p(Les;IB)V")
    public static final void method662(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1931; var2++) {
            if (arg0.field1965[var2] != -2) {
                int var3 = arg0.field1933[var2];
                int var4 = arg0.field1934[var2];
                int var5 = arg0.field1935[var2];
                int var6 = class134.field1932[var3];
                int var7 = class134.field1932[var4];
                int var8 = class134.field1932[var5];
                int var9 = class134.field1938[var3];
                int var10 = class134.field1938[var4];
                int var11 = class134.field1938[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                Statics.method4415(var12, var14, var13, var15, -49088);
            }
        }
    }
}
