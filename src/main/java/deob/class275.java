package deob;

import java.util.Comparator;

@ObfuscatedName("jq")
public abstract class class275 implements Comparator {

    @ObfuscatedName("jq.x")
    public Comparator field3567;

    @ObfuscatedName("jq.d(Ljava/util/Comparator;I)V")
    public final void method4698(Comparator arg0) {
        if (this.field3567 == null) {
            this.field3567 = arg0;
        } else if (this.field3567 instanceof class275) {
            ((class275) this.field3567).method4698(arg0);
        }
    }

    @ObfuscatedName("jq.z(Ljw;Ljw;B)I")
    public final int method4697(class274 arg0, class274 arg1) {
        return this.field3567 == null ? 0 : this.field3567.compare(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
