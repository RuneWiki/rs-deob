package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("fe")
public class class135 implements Callable {

    // $FF: synthetic field
    public final class140 this$0;

    // $FF: synthetic field
    public final int val$workStart;

    // $FF: synthetic field
    public final int val$workEnd;

    // $FF: synthetic field
    public final class131[] val$curveLoadJobs;

    public class135(class140 arg0, int arg1, int arg2, class131[] arg3) {
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
