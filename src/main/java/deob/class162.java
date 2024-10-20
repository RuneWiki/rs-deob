package deob;

@ObfuscatedName("fn")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.x(J)V")
    public static final void method2485(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method758(arg0 - 1L);
            method758(1L);
        } else {
            method758(arg0);
        }
    }

    @ObfuscatedName("at.j(J)V")
    public static final void method758(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
