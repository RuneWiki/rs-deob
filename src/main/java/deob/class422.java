package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("qd")
public class class422 implements Comparator {

    // $FF: synthetic field
    public final class421 this$0;

    public class422(class421 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qd.aw(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
    public int method7105(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7105((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
