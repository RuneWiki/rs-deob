package deob;

import java.util.Comparator;

@ObfuscatedName("vn")
public class class556 implements Comparator {

    @ObfuscatedName("vn.ab")
    public final boolean field5444;

    public class556(boolean arg0) {
        this.field5444 = arg0;
    }

    @ObfuscatedName("vn.ab(Lsz;Lsz;I)I")
    public int method9104(class472 arg0, class472 arg1) {
        return this.field5444 ? arg0.method7944().method9478(arg1.method7944()) : arg1.method7944().method9478(arg0.method7944());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9104((class472) arg0, (class472) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
