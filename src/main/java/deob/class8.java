package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ae")
public class class8 {

    @ObfuscatedName("ae.ap")
    public ExecutorService field17 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ae.aw")
    public Future field21;

    @ObfuscatedName("ae.ak")
    public final class558 field19;

    @ObfuscatedName("ae.aj")
    public final class4 field20;

    public class8(class558 arg0, class4 arg1) {
        this.field19 = arg0;
        this.field20 = arg1;
        this.method55();
    }

    @ObfuscatedName("ae.ap(B)Z")
    public boolean method45() {
        return this.field21.isDone();
    }

    @ObfuscatedName("ae.aw(B)V")
    public void method46() {
        this.field17.shutdown();
        this.field17 = null;
    }

    @ObfuscatedName("ae.ak(S)Lvl;")
    public class558 method44() {
        try {
            return (class558) this.field21.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ae.aj(B)V")
    public void method55() {
        this.field21 = this.field17.submit(new class2(this, this.field19, this.field20));
    }
}
