package deob;

@ObfuscatedName("jg")
public class class277 {

    @ObfuscatedName("jg.i")
    public static final class277 field3738 = new class277(0);

    @ObfuscatedName("jg.w")
    public static final class277 field3741 = new class277(1);

    @ObfuscatedName("jg.a")
    public static final class277 field3740 = new class277(2);

    @ObfuscatedName("jg.t")
    public final int field3739;

    public class277(int arg0) {
        this.field3739 = arg0;
    }

    @ObfuscatedName("bn.i(II)Ljg;")
    public static class277 method1028(int arg0) {
        class277[] var1 = new class277[] { field3740, field3738, field3741 };
        class277[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class277 var4 = var2[var3];
            if (var4.field3739 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
