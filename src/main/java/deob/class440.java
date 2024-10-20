package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("qo")
public class class440 implements Comparator {

    // $FF: synthetic field
    public final class439 this$0;

    public class440(class439 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qo.aq(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
    public int method7438(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7438((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
