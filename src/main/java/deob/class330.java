package deob;

@ObfuscatedName("mn")
public class class330 {

    public class330() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gx.ab(J)V")
    public static final void method3326(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method351(arg0 - 1L);
            method351(1L);
        } else {
            method351(arg0);
        }
    }

    @ObfuscatedName("az.ay(J)V")
    public static final void method351(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
