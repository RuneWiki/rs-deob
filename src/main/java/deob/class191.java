package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class191 implements Iterable {

    @ObfuscatedName("gu.n")
    public class195 field3004 = new class195();

    public class191() {
        this.field3004.field3008 = this.field3004;
        this.field3004.field3009 = this.field3004;
    }

    @ObfuscatedName("gu.n()V")
    public void method3479() {
        while (this.field3004.field3008 != this.field3004) {
            this.field3004.field3008.method3518();
        }
    }

    @ObfuscatedName("gu.o(Lgo;)V")
    public void method3478(class195 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3518();
        }
        arg0.field3009 = this.field3004.field3009;
        arg0.field3008 = this.field3004;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
