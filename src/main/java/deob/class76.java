package deob;

@ObfuscatedName("h")
public class class76 extends class77 {

    @ObfuscatedName("h.g")
    public int field852;

    @ObfuscatedName("h.n")
    public int field851;

    @ObfuscatedName("h.o")
    public int[] field847;

    @ObfuscatedName("h.j")
    public static class67 field848 = new class67(128);

    @ObfuscatedName("h.h")
    public int field849;

    @ObfuscatedName("h.t")
    public String[] field853;

    @ObfuscatedName("h.r")
    public int field850;

    @ObfuscatedName("h.p")
    public int[] field846;

    @ObfuscatedName("db.j(IB)Lh;")
    public static class76 method2267(int arg0) {
        class76 var1 = (class76) field848.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2566.method1083(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class76 var3 = new class76();
        class31 var4 = new class31(var2);
        var4.field172 = var4.field168.length - 12;
        int var5 = var4.method376();
        var3.field849 = var4.method373();
        var3.field850 = var4.method373();
        var3.field851 = var4.method373();
        var3.field852 = var4.method373();
        var4.field172 = 0;
        var4.method378();
        var3.field846 = new int[var5];
        var3.field847 = new int[var5];
        var3.field853 = new String[var5];
        int var6 = 0;
        while (var4.field172 < var4.field168.length - 12) {
            int var7 = var4.method373();
            if (var7 == 3) {
                var3.field853[var6] = var4.method379();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field847[var6] = var4.method512();
            } else {
                var3.field847[var6] = var4.method376();
            }
            var3.field846[var6++] = var7;
        }
        field848.method907(var3, (long) arg0);
        return var3;
    }
}
