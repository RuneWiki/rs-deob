package deob;

@ObfuscatedName("fy")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.i(J)V")
    public static final void method150(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2420(arg0 - 1L);
            method2420(1L);
        } else {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @ObfuscatedName("eh.e(J)V")
    public static final void method2420(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
