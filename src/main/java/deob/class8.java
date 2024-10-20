package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ab")
public class class8 {

    @ObfuscatedName("ab.ac")
    public ExecutorService field26 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ab.al")
    public Future field24;

    @ObfuscatedName("ab.ak")
    public final class530 field25;

    @ObfuscatedName("ab.ax")
    public final class4 field23;

    public class8(class530 arg0, class4 arg1) {
        this.field25 = arg0;
        this.field23 = arg1;
        this.method44();
    }

    @ObfuscatedName("ab.ac(B)Z")
    public boolean method41() {
        return this.field24.isDone();
    }

    @ObfuscatedName("ab.al(B)V")
    public void method42() {
        this.field26.shutdown();
        this.field26 = null;
    }

    @ObfuscatedName("ab.ak(I)Lul;")
    public class530 method43() {
        try {
            return (class530) this.field24.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ab.ax(I)V")
    public void method44() {
        this.field24 = this.field26.submit(new class2(this, this.field25, this.field23));
    }
}
