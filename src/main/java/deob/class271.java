package deob;

@ObfuscatedName("jj")
public class class271 {

    public class271() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.s(J)V")
    public static final void method2748(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method6707(arg0 - 1L);
            method6707(1L);
        } else {
            method6707(arg0);
        }
    }

    @ObfuscatedName("pi.h(J)V")
    public static final void method6707(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
