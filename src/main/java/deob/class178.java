package deob;

import java.util.Iterator;

@ObfuscatedName("fq")
public class class178 implements Iterable {

    @ObfuscatedName("fq.e")
    public class182 field2858 = new class182();

    public class178() {
        this.field2858.field2862 = this.field2858;
        this.field2858.field2863 = this.field2858;
    }

    @ObfuscatedName("fq.e()V")
    public void method3146() {
        while (this.field2858.field2862 != this.field2858) {
            this.field2858.field2862.method3187();
        }
    }

    @ObfuscatedName("fq.o(Lfm;)V")
    public void method3152(class182 arg0) {
        if (arg0.field2863 != null) {
            arg0.method3187();
        }
        arg0.field2863 = this.field2858.field2863;
        arg0.field2862 = this.field2858;
        arg0.field2863.field2862 = arg0;
        arg0.field2862.field2863 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
