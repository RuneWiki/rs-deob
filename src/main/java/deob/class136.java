package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fe")
public class class136 implements Callable {

    // $FF: synthetic field
    public final class137 this$0;

    // $FF: synthetic field
    public final int val$workStart;

    // $FF: synthetic field
    public final int val$workEnd;

    // $FF: synthetic field
    public final class129[] val$curveLoadJobs;

    public class136(class137 arg0, int arg1, int arg2, class129[] arg3) {
        this.this$0 = arg0;
        this.val$workStart = arg1;
        this.val$workEnd = arg2;
        this.val$curveLoadJobs = arg3;
    }

    public Object call() {
        for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
            this.val$curveLoadJobs[var1].call();
        }
        return null;
    }
}
