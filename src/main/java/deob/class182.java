package deob;

@ObfuscatedName("fn")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.p(J)V")
    public static final void method2791(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2592(arg0 - 1L);
            method2592(1L);
        } else {
            method2592(arg0);
        }
    }

    @ObfuscatedName("ee.m(J)V")
    public static final void method2592(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
