package deob;

@ObfuscatedName("ma")
public class class332 {

    public class332() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iv.ac(J)V")
    public static final void method4128(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method6020(arg0 - 1L);
            method6020(1L);
        } else {
            method6020(arg0);
        }
    }

    @ObfuscatedName("mt.ae(J)V")
    public static final void method6020(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
