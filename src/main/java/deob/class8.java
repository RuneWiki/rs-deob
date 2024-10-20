package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("aw")
public class class8 {

    @ObfuscatedName("aw.az")
    public ExecutorService field21 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("aw.ah")
    public Future field23;

    @ObfuscatedName("aw.af")
    public final class535 field20;

    @ObfuscatedName("aw.at")
    public final class4 field19;

    public class8(class535 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field19 = arg1;
        this.method47();
    }

    @ObfuscatedName("aw.az(S)Z")
    public boolean method45() {
        return this.field23.isDone();
    }

    @ObfuscatedName("aw.ah(S)V")
    public void method58() {
        this.field21.shutdown();
        this.field21 = null;
    }

    @ObfuscatedName("aw.af(B)Lur;")
    public class535 method57() {
        try {
            return (class535) this.field23.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("aw.at(B)V")
    public void method47() {
        this.field23 = this.field21.submit(new class2(this, this.field20, this.field19));
    }
}
