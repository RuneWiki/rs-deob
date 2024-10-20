package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("az")
public class class8 {

    @ObfuscatedName("az.aq")
    public ExecutorService field19 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("az.aw")
    public Future field14;

    @ObfuscatedName("az.al")
    public final class534 field16;

    @ObfuscatedName("az.ai")
    public final class4 field17;

    public class8(class534 arg0, class4 arg1) {
        this.field16 = arg0;
        this.field17 = arg1;
        this.method42();
    }

    @ObfuscatedName("az.aq(I)Z")
    public boolean method39() {
        return this.field14.isDone();
    }

    @ObfuscatedName("az.aw(B)V")
    public void method40() {
        this.field19.shutdown();
        this.field19 = null;
    }

    @ObfuscatedName("az.al(I)Luq;")
    public class534 method41() {
        try {
            return (class534) this.field14.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("az.ai(I)V")
    public void method42() {
        this.field14 = this.field19.submit(new class2(this, this.field16, this.field17));
    }
}
