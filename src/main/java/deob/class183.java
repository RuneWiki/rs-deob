package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class183 implements Iterable {

    @ObfuscatedName("gl.v")
    public class187 field2897 = new class187();

    public class183() {
        this.field2897.field2901 = this.field2897;
        this.field2897.field2902 = this.field2897;
    }

    @ObfuscatedName("gl.v()V")
    public void method3332() {
        while (this.field2897.field2901 != this.field2897) {
            this.field2897.field2901.method3371();
        }
    }

    @ObfuscatedName("gl.t(Lga;)V")
    public void method3333(class187 arg0) {
        if (arg0.field2902 != null) {
            arg0.method3371();
        }
        arg0.field2902 = this.field2897.field2902;
        arg0.field2901 = this.field2897;
        arg0.field2902.field2901 = arg0;
        arg0.field2901.field2902 = arg0;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
