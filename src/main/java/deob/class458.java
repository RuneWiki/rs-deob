package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("rl")
public class class458 implements Comparator {

    // $FF: synthetic field
    public final class457 this$0;

    public class458(class457 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rl.ak(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
    public int method7745(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7745((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
