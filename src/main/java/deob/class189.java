package deob;

@ObfuscatedName("gl")
public class class189 {

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.b(J)V")
    public static final void method2888(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2847(arg0 - 1L);
            method2847(1L);
        } else {
            method2847(arg0);
        }
    }

    @ObfuscatedName("fp.s(J)V")
    public static final void method2847(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
