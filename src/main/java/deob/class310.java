package deob;

import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("le")
public final class class310 implements Callable {

    // $FF: synthetic field
    public final PriorityQueue val$waves;

    // $FF: synthetic field
    public final AtomicBoolean val$cancelled;

    public class310(PriorityQueue arg0, AtomicBoolean arg1) {
        this.val$waves = arg0;
        this.val$cancelled = arg1;
    }

    public Object call() {
        while (!this.val$waves.isEmpty() && !this.val$cancelled.get()) {
            ((class311) this.val$waves.peek()).field3457.method971();
            this.val$waves.remove();
        }
        return null;
    }
}
