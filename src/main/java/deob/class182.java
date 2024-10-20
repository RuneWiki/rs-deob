package deob;

@ObfuscatedName("fw")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.i(J)V")
    public static final void method1004(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2783(arg0 - 1L);
            method2783(1L);
        } else {
            method2783(arg0);
        }
    }

    @ObfuscatedName("fc.w(J)V")
    public static final void method2783(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
