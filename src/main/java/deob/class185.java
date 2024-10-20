package deob;

@ObfuscatedName("gz")
public class class185 {

    public class185() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.w(J)V")
    public static final void method7(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2809(arg0 - 1L);
            method2809(1L);
        } else {
            method2809(arg0);
        }
    }

    @ObfuscatedName("fq.o(J)V")
    public static final void method2809(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
