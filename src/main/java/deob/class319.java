package deob;

@ObfuscatedName("ml")
public class class319 {

    public class319() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.aq(J)V")
    public static final void method3040(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1135(arg0 - 1L);
            method1135(1L);
        } else {
            method1135(arg0);
        }
    }

    @ObfuscatedName("ce.aw(J)V")
    public static final void method1135(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
