package deob;

@ObfuscatedName("fn")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.e(J)V")
    public static final void method1535(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var6) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var7) {
        }
        method2695(1L);
    }

    @ObfuscatedName("ei.o(J)V")
    public static final void method2695(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
