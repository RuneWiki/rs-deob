package deob;

import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("nr")
public class class340 implements Callable {

    // $FF: synthetic field
    public final class334 this$0;

    // $FF: synthetic field
    public final AtomicBoolean val$cancelled;

    public class340(class334 arg0, AtomicBoolean arg1) {
        this.this$0 = arg0;
        this.val$cancelled = arg1;
    }

    public Object call() {
        PriorityQueue var1 = this.this$0.field3597;
        while (true) {
            Object var2 = null;
            class337 var4;
            synchronized (var1) {
                if (var1.isEmpty() || this.val$cancelled.get()) {
                    return null;
                }
                var4 = (class337) var1.remove();
            }
            var4.field3627.method985();
        }
    }
}
