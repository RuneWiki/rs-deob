package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("q")
public class class8 {

    @ObfuscatedName("q.c")
    public ExecutorService field28 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("q.p")
    public Future field23;

    @ObfuscatedName("q.f")
    public final class445 field24;

    @ObfuscatedName("q.n")
    public final class4 field25;

    public class8(class445 arg0, class4 arg1) {
        this.field24 = arg0;
        this.field25 = arg1;
        this.method55();
    }

    @ObfuscatedName("q.c(B)Z")
    public boolean method48() {
        return this.field23.isDone();
    }

    @ObfuscatedName("q.p(I)V")
    public void method49() {
        this.field28.shutdown();
        this.field28 = null;
    }

    @ObfuscatedName("q.f(B)Lqq;")
    public class445 method52() {
        try {
            return (class445) this.field23.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("q.n(B)V")
    public void method55() {
        this.field23 = this.field28.submit(new class2(this, this.field24, this.field25));
    }
}
