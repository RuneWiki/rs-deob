package deob;

@ObfuscatedName("jm")
public class class237 {

    @ObfuscatedName("jm.am")
    public static final class237 field2484 = new class237(2, 0, 4);

    @ObfuscatedName("jm.ap")
    public static final class237 field2482 = new class237(1, 1, 2);

    @ObfuscatedName("jm.af")
    public static final class237 field2483 = new class237(0, 2, 0);

    @ObfuscatedName("jm.aj")
    public final int field2485;

    @ObfuscatedName("jm.aq")
    public final int field2481;

    @ObfuscatedName("jm.ar")
    public final int field2486;

    public class237(int arg0, int arg1, int arg2) {
        this.field2485 = arg0;
        this.field2481 = arg1;
        this.field2486 = arg2;
    }

    @ObfuscatedName("jm.am(FS)Z")
    public boolean method4219(float arg0) {
        return arg0 >= (float) this.field2486;
    }

    @ObfuscatedName("jm.ap(II)Ljm;")
    public static class237 method4220(int arg0) {
        class237[] var1 = new class237[] { field2483, field2482, field2484 };
        class237[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class237 var4 = var2[var3];
            if (var4.field2481 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
