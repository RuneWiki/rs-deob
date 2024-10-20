package deob;

@ObfuscatedName("vp")
public class class569 {

    @ObfuscatedName("vp.ab")
    public static final class569 field5540 = new class569(0);

    @ObfuscatedName("vp.ay")
    public static final class569 field5538 = new class569(1);

    @ObfuscatedName("vp.an")
    public static final class569 field5537 = new class569(2);

    @ObfuscatedName("vp.au")
    public final int field5541;

    public class569(int arg0) {
        this.field5541 = arg0;
    }

    @ObfuscatedName("un.ab(IB)Lvp;")
    public static class569 method8719(int arg0) {
        class569[] var1 = new class569[] { field5540, field5537, field5538 };
        class569[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class569 var4 = var2[var3];
            if (var4.field5541 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
