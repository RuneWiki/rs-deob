package deob;

import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mo")
public class class324 implements Callable {

    // $FF: synthetic field
    public final class318 this$0;

    // $FF: synthetic field
    public final AtomicBoolean val$cancelled;

    public class324(class318 arg0, AtomicBoolean arg1) {
        this.this$0 = arg0;
        this.val$cancelled = arg1;
    }

    public Object call() {
        PriorityQueue var1 = this.this$0.field3453;
        while (true) {
            Object var2 = null;
            class321 var4;
            synchronized (var1) {
                if (var1.isEmpty() || this.val$cancelled.get()) {
                    return null;
                }
                var4 = (class321) var1.remove();
            }
            var4.field3475.method1014();
        }
    }
}
