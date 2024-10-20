package deob;

@ObfuscatedName("oz")
public class class399 {

    public class399() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.i(J)V")
    public static final void method2872(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2178(arg0 - 1L);
            method2178(1L);
        } else {
            method2178(arg0);
        }
    }

    @ObfuscatedName("cr.w(J)V")
    public static final void method2178(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
