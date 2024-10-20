package deob;

@ObfuscatedName("fc")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.q(J)V")
    public static final void method2156(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2044(arg0 - 1L);
            method2044(1L);
        } else {
            method2044(arg0);
        }
    }

    @ObfuscatedName("dy.d(J)V")
    public static final void method2044(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
