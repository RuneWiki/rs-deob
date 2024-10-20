package deob;

@ObfuscatedName("vc")
public class class566 {

    @ObfuscatedName("vc.aq")
    public static final class566 field5501 = new class566(0);

    @ObfuscatedName("vc.ad")
    public static final class566 field5502 = new class566(1);

    @ObfuscatedName("vc.ag")
    public static final class566 field5503 = new class566(2);

    @ObfuscatedName("vc.ak")
    public final int field5504;

    public class566(int arg0) {
        this.field5504 = arg0;
    }

    @ObfuscatedName("aj.aq(II)Lvc;")
    public static class566 method38(int arg0) {
        class566[] var1 = new class566[] { field5502, field5503, field5501 };
        class566[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class566 var4 = var2[var3];
            if (var4.field5504 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
