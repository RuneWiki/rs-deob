package deob;

@ObfuscatedName("gj")
public class class204 {

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.c(J)V")
    public static final void method2982(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3205(arg0 - 1L);
            method3205(1L);
        } else {
            method3205(arg0);
        }
    }

    @ObfuscatedName("gs.i(J)V")
    public static final void method3205(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
