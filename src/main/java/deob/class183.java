package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class183 implements Iterable {

    @ObfuscatedName("gh.p")
    public class187 field2887 = new class187();

    public class183() {
        this.field2887.field2891 = this.field2887;
        this.field2887.field2892 = this.field2887;
    }

    @ObfuscatedName("gh.p()V")
    public void method3296() {
        while (this.field2887.field2891 != this.field2887) {
            this.field2887.field2891.method3331();
        }
    }

    @ObfuscatedName("gh.y(Lgo;)V")
    public void method3299(class187 arg0) {
        if (arg0.field2892 != null) {
            arg0.method3331();
        }
        arg0.field2892 = this.field2887.field2892;
        arg0.field2891 = this.field2887;
        arg0.field2892.field2891 = arg0;
        arg0.field2891.field2892 = arg0;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
