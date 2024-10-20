package deob;

@ObfuscatedName("gb")
public class class193 {

    public class193() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.a(J)V")
    public static final void method1373(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3740(arg0 - 1L);
            method3740(1L);
        } else {
            method3740(arg0);
        }
    }

    @ObfuscatedName("hc.w(J)V")
    public static final void method3740(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
