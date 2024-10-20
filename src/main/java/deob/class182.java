package deob;

@ObfuscatedName("fa")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.d(J)V")
    public static final void method3711(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method639(arg0 - 1L);
            method639(1L);
        } else {
            method639(arg0);
        }
    }

    @ObfuscatedName("ac.k(J)V")
    public static final void method639(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
