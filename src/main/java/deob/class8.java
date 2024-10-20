package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ao")
public class class8 {

    @ObfuscatedName("ao.am")
    public ExecutorService field11 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ao.ap")
    public Future field12;

    @ObfuscatedName("ao.af")
    public final class531 field13;

    @ObfuscatedName("ao.aj")
    public final class4 field14;

    public class8(class531 arg0, class4 arg1) {
        this.field13 = arg0;
        this.field14 = arg1;
        this.method48();
    }

    @ObfuscatedName("ao.am(I)Z")
    public boolean method42() {
        return this.field12.isDone();
    }

    @ObfuscatedName("ao.ap(B)V")
    public void method43() {
        this.field11.shutdown();
        this.field11 = null;
    }

    @ObfuscatedName("ao.af(B)Luk;")
    public class531 method44() {
        try {
            return (class531) this.field12.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ao.aj(B)V")
    public void method48() {
        this.field12 = this.field11.submit(new class2(this, this.field13, this.field14));
    }
}
