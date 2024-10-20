package deob;

@ObfuscatedName("fj")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.u(J)V")
    public static final void method1528(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method705(arg0 - 1L);
            method705(1L);
        } else {
            method705(arg0);
        }
    }

    @ObfuscatedName("ah.x(J)V")
    public static final void method705(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
