package deob;

@ObfuscatedName("fn")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.b(J)V")
    public static final void method2157(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1942(arg0 - 1L);
            method1942(1L);
        } else {
            method1942(arg0);
        }
    }

    @ObfuscatedName("dq.l(J)V")
    public static final void method1942(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
