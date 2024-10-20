package deob;

@ObfuscatedName("jh")
public class class239 {

    @ObfuscatedName("jh.aq")
    public static final class239 field2489 = new class239(2, 0, 4);

    @ObfuscatedName("jh.aw")
    public static final class239 field2490 = new class239(0, 1, 2);

    @ObfuscatedName("jh.al")
    public static final class239 field2492 = new class239(1, 2, 0);

    @ObfuscatedName("jh.ai")
    public final int field2494;

    @ObfuscatedName("jh.ar")
    public final int field2493;

    @ObfuscatedName("jh.as")
    public final int field2491;

    public class239(int arg0, int arg1, int arg2) {
        this.field2494 = arg0;
        this.field2493 = arg1;
        this.field2491 = arg2;
    }

    @ObfuscatedName("jh.aq(FI)Z")
    public boolean method4209(float arg0) {
        return arg0 >= (float) this.field2491;
    }

    @ObfuscatedName("jh.aw(II)Ljh;")
    public static class239 method4210(int arg0) {
        class239[] var1 = new class239[] { field2492, field2489, field2490 };
        class239[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class239 var4 = var2[var3];
            if (var4.field2493 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
