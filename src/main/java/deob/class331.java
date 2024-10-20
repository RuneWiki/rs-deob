package deob;

@ObfuscatedName("ma")
public class class331 {

    public class331() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.ap(J)V")
    public static final void method1920(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method320(arg0 - 1L);
            method320(1L);
        } else {
            method320(arg0);
        }
    }

    @ObfuscatedName("al.aw(J)V")
    public static final void method320(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
