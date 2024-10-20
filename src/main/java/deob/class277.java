package deob;

@ObfuscatedName("jt")
public class class277 {

    @ObfuscatedName("jt.n")
    public static final class277 field3735 = new class277(0);

    @ObfuscatedName("jt.p")
    public static final class277 field3734 = new class277(1);

    @ObfuscatedName("jt.i")
    public static final class277 field3733 = new class277(2);

    @ObfuscatedName("jt.j")
    public final int field3736;

    public class277(int arg0) {
        this.field3736 = arg0;
    }

    @ObfuscatedName("hj.n(IB)Ljt;")
    public static class277 method3784(int arg0) {
        class277[] var1 = new class277[] { field3733, field3734, field3735 };
        class277[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class277 var4 = var2[var3];
            if (var4.field3736 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
