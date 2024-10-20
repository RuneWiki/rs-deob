package deob;

@ObfuscatedName("lr")
public class class291 {

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.aj(J)V")
    public static final void method1994(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3187(arg0 - 1L);
            method3187(1L);
        } else {
            method3187(arg0);
        }
    }

    @ObfuscatedName("gl.al(J)V")
    public static final void method3187(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
