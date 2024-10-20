package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("al")
public class class8 {

    @ObfuscatedName("al.af")
    public ExecutorService field31 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("al.an")
    public Future field29;

    @ObfuscatedName("al.aw")
    public final class489 field25;

    @ObfuscatedName("al.ac")
    public final class4 field27;

    public class8(class489 arg0, class4 arg1) {
        this.field25 = arg0;
        this.field27 = arg1;
        this.method48();
    }

    @ObfuscatedName("al.af(I)Z")
    public boolean method55() {
        return this.field29.isDone();
    }

    @ObfuscatedName("al.an(B)V")
    public void method46() {
        this.field31.shutdown();
        this.field31 = null;
    }

    @ObfuscatedName("al.aw(I)Lsg;")
    public class489 method47() {
        try {
            return (class489) this.field29.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("al.ac(S)V")
    public void method48() {
        this.field29 = this.field31.submit(new class2(this, this.field25, this.field27));
    }
}
