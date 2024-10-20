package deob;

import java.util.Iterator;

@ObfuscatedName("fp")
public class class178 implements Iterable {

    @ObfuscatedName("fp.z")
    public class181 field2845 = new class181();

    public class178() {
        this.field2845.field2849 = this.field2845;
        this.field2845.field2848 = this.field2845;
    }

    @ObfuscatedName("fp.z()V")
    public void method3266() {
        while (this.field2845.field2849 != this.field2845) {
            this.field2845.field2849.method3294();
        }
    }

    @ObfuscatedName("fp.j(Lfe;)V")
    public void method3260(class181 arg0) {
        if (arg0.field2848 != null) {
            arg0.method3294();
        }
        arg0.field2848 = this.field2845.field2848;
        arg0.field2849 = this.field2845;
        arg0.field2848.field2849 = arg0;
        arg0.field2849.field2848 = arg0;
    }

    public Iterator iterator() {
        return new class182(this);
    }
}
