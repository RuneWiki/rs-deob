package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ap")
public class class8 {

    @ObfuscatedName("ap.au")
    public ExecutorService field22 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ap.ae")
    public Future field27;

    @ObfuscatedName("ap.ao")
    public final class515 field23;

    @ObfuscatedName("ap.at")
    public final class4 field21;

    public class8(class515 arg0, class4 arg1) {
        this.field23 = arg0;
        this.field21 = arg1;
        this.method37();
    }

    @ObfuscatedName("ap.au(I)Z")
    public boolean method39() {
        return this.field27.isDone();
    }

    @ObfuscatedName("ap.ae(I)V")
    public void method36() {
        this.field22.shutdown();
        this.field22 = null;
    }

    @ObfuscatedName("ap.ao(B)Ltm;")
    public class515 method38() {
        try {
            return (class515) this.field27.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ap.at(I)V")
    public void method37() {
        this.field27 = this.field22.submit(new class2(this, this.field23, this.field21));
    }
}
