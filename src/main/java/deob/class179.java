package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class179 implements Iterable {

    @ObfuscatedName("fe.g")
    public class183 field2868 = new class183();

    public class179() {
        this.field2868.field2872 = this.field2868;
        this.field2868.field2873 = this.field2868;
    }

    @ObfuscatedName("fe.g()V")
    public void method3219() {
        while (this.field2868.field2872 != this.field2868) {
            this.field2868.field2872.method3257();
        }
    }

    @ObfuscatedName("fe.s(Lgk;)V")
    public void method3220(class183 arg0) {
        if (arg0.field2873 != null) {
            arg0.method3257();
        }
        arg0.field2873 = this.field2868.field2873;
        arg0.field2872 = this.field2868;
        arg0.field2873.field2872 = arg0;
        arg0.field2872.field2873 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
