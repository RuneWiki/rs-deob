package deob;

@ObfuscatedName("ge")
public class class204 {

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.o(J)V")
    public static final void method12(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2833(arg0 - 1L);
            method2833(1L);
        } else {
            method2833(arg0);
        }
    }

    @ObfuscatedName("es.k(J)V")
    public static final void method2833(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
