package deob;

@ObfuscatedName("qi")
public class class461 {

    @ObfuscatedName("qi.s")
    public static final class461 field4826 = new class461(0);

    @ObfuscatedName("qi.h")
    public static final class461 field4824 = new class461(1);

    @ObfuscatedName("qi.w")
    public static final class461 field4827 = new class461(2);

    @ObfuscatedName("qi.v")
    public final int field4825;

    public class461(int arg0) {
        this.field4825 = arg0;
    }

    @ObfuscatedName("kr.s(IB)Lqi;")
    public static class461 method5094(int arg0) {
        class461[] var1 = new class461[] { field4826, field4824, field4827 };
        class461[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class461 var4 = var2[var3];
            if (var4.field4825 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
