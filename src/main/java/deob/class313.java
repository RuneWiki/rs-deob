package deob;

import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("md")
public class class313 implements Callable {

    // $FF: synthetic field
    public final class307 this$0;

    // $FF: synthetic field
    public final AtomicBoolean val$cancelled;

    public class313(class307 arg0, AtomicBoolean arg1) {
        this.this$0 = arg0;
        this.val$cancelled = arg1;
    }

    public Object call() {
        PriorityQueue var1 = this.this$0.field3424;
        while (true) {
            Object var2 = null;
            class310 var4;
            synchronized (var1) {
                if (var1.isEmpty() || this.val$cancelled.get()) {
                    return null;
                }
                var4 = (class310) var1.remove();
            }
            var4.field3465.method1036();
        }
    }
}
