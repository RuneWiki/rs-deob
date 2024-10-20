package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ac")
public class class8 {

    @ObfuscatedName("ac.at")
    public ExecutorService field25 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ac.ah")
    public Future field19;

    @ObfuscatedName("ac.ar")
    public final class527 field20;

    @ObfuscatedName("ac.ao")
    public final class4 field21;

    public class8(class527 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field21 = arg1;
        this.method52();
    }

    @ObfuscatedName("ac.at(I)Z")
    public boolean method47() {
        return this.field19.isDone();
    }

    @ObfuscatedName("ac.ah(B)V")
    public void method58() {
        this.field25.shutdown();
        this.field25 = null;
    }

    @ObfuscatedName("ac.ar(I)Luj;")
    public class527 method48() {
        try {
            return (class527) this.field19.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ac.ao(I)V")
    public void method52() {
        this.field19 = this.field25.submit(new class2(this, this.field20, this.field21));
    }
}
