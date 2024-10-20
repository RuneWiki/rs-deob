package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ab")
public class class8 {

    @ObfuscatedName("ab.ak")
    public ExecutorService field20 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ab.al")
    public Future field23;

    @ObfuscatedName("ab.aj")
    public final class546 field21;

    @ObfuscatedName("ab.az")
    public final class4 field19;

    public class8(class546 arg0, class4 arg1) {
        this.field21 = arg0;
        this.field19 = arg1;
        this.method42();
    }

    @ObfuscatedName("ab.ak(I)Z")
    public boolean method39() {
        return this.field23.isDone();
    }

    @ObfuscatedName("ab.al(B)V")
    public void method40() {
        this.field20.shutdown();
        this.field20 = null;
    }

    @ObfuscatedName("ab.aj(S)Lua;")
    public class546 method41() {
        try {
            return (class546) this.field23.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ab.az(I)V")
    public void method42() {
        this.field23 = this.field20.submit(new class2(this, this.field21, this.field19));
    }
}
