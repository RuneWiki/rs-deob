package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("qa")
public class class436 implements Comparator {

    // $FF: synthetic field
    public final class435 this$0;

    public class436(class435 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qa.ac(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
    public int method7208(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7208((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
