package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fz")
public class class142 implements Callable {

    // $FF: synthetic field
    public final class143 this$0;

    // $FF: synthetic field
    public final int val$workStart;

    // $FF: synthetic field
    public final int val$workEnd;

    // $FF: synthetic field
    public final class135[] val$curveLoadJobs;

    public class142(class143 arg0, int arg1, int arg2, class135[] arg3) {
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
