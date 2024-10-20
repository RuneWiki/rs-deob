package deob;

import java.util.Comparator;

@ObfuscatedName("tf")
public class class507 implements Comparator {

    @ObfuscatedName("tf.at")
    public final boolean field5081;

    public class507(boolean arg0) {
        this.field5081 = arg0;
    }

    @ObfuscatedName("tf.at(Lqm;Lqm;B)I")
    public int method8438(class421 arg0, class421 arg1) {
        return this.field5081 ? arg0.method7110(arg1) : arg1.method7110(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8438((class421) arg0, (class421) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
