package deob;

@ObfuscatedName("jw")
public class class286 {

    @ObfuscatedName("jw.m")
    public static final class286 field3787 = new class286(0);

    @ObfuscatedName("jw.p")
    public static final class286 field3794 = new class286(1);

    @ObfuscatedName("jw.i")
    public static final class286 field3788 = new class286(2);

    @ObfuscatedName("jw.j")
    public final int field3786;

    @ObfuscatedName("cx.m(I)[Ljw;")
    public static class286[] method1801() {
        return new class286[] { field3794, field3787, field3788 };
    }

    public class286(int arg0) {
        this.field3786 = arg0;
    }

    @ObfuscatedName("it.p(II)Ljw;")
    public static class286 method4099(int arg0) {
        class286[] var1 = method1801();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class286 var3 = var1[var2];
            if (var3.field3786 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
