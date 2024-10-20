package deob;

@ObfuscatedName("kt")
public class class310 {

    @ObfuscatedName("kt.a")
    public static final class310 field3779 = new class310(0);

    @ObfuscatedName("kt.t")
    public static final class310 field3780 = new class310(1);

    @ObfuscatedName("kt.n")
    public static final class310 field3783 = new class310(2);

    @ObfuscatedName("kt.q")
    public final int field3782;

    public class310(int arg0) {
        this.field3782 = arg0;
    }

    @ObfuscatedName("it.a(II)Lkt;")
    public static class310 method4432(int arg0) {
        class310[] var1 = new class310[] { field3779, field3783, field3780 };
        class310[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            if (var4.field3782 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
