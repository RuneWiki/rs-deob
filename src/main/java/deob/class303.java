package deob;

@ObfuscatedName("lr")
public class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.au(J)V")
    public static final void method2265(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method4668(arg0 - 1L);
            method4668(1L);
        } else {
            method4668(arg0);
        }
    }

    @ObfuscatedName("jx.ae(J)V")
    public static final void method4668(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
