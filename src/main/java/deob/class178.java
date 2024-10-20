package deob;

import java.util.Iterator;

@ObfuscatedName("ff")
public class class178 implements Iterable {

    @ObfuscatedName("ff.j")
    public class181 field2850 = new class181();

    public class178() {
        this.field2850.field2853 = this.field2850;
        this.field2850.field2854 = this.field2850;
    }

    @ObfuscatedName("ff.j()V")
    public void method3270() {
        while (this.field2850.field2853 != this.field2850) {
            this.field2850.field2853.method3294();
        }
    }

    @ObfuscatedName("ff.z(Lfe;)V")
    public void method3272(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3294();
        }
        arg0.field2854 = this.field2850.field2854;
        arg0.field2853 = this.field2850;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    public Iterator iterator() {
        return new class182(this);
    }
}
