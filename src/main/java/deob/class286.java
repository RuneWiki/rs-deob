package deob;

@ObfuscatedName("jq")
public class class286 {

    @ObfuscatedName("jq.b")
    public static final class286 field3783 = new class286(0);

    @ObfuscatedName("jq.s")
    public static final class286 field3784 = new class286(1);

    @ObfuscatedName("jq.r")
    public static final class286 field3785 = new class286(2);

    @ObfuscatedName("jq.g")
    public final int field3786;

    @ObfuscatedName("br.b(S)[Ljq;")
    public static class286[] method918() {
        return new class286[] { field3785, field3784, field3783 };
    }

    public class286(int arg0) {
        this.field3786 = arg0;
    }

    @ObfuscatedName("hy.s(II)Ljq;")
    public static class286 method3679(int arg0) {
        class286[] var1 = method918();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class286 var3 = var1[var2];
            if (var3.field3786 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
