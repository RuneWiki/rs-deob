package deob;

@ObfuscatedName("py")
public class class438 {

    @ObfuscatedName("py.c")
    public static final class438 field4635 = new class438(0);

    @ObfuscatedName("py.l")
    public static final class438 field4633 = new class438(1);

    @ObfuscatedName("py.s")
    public static final class438 field4634 = new class438(2);

    @ObfuscatedName("py.e")
    public final int field4632;

    @ObfuscatedName("f.c(I)[Lpy;")
    public static class438[] method283() {
        return new class438[] { field4635, field4633, field4634 };
    }

    public class438(int arg0) {
        this.field4632 = arg0;
    }

    @ObfuscatedName("ho.l(IB)Lpy;")
    public static class438 method4349(int arg0) {
        class438[] var1 = method283();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class438 var3 = var1[var2];
            if (var3.field4632 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
