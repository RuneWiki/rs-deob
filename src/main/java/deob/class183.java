package deob;

@ObfuscatedName("gy")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.e(J)V")
    public static final void method534(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method39(arg0 - 1L);
            method39(1L);
        } else {
            method39(arg0);
        }
    }

    @ObfuscatedName("u.n(J)V")
    public static final void method39(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
