package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class179 implements Iterable {

    @ObfuscatedName("fz.k")
    public class183 field2863 = new class183();

    public class179() {
        this.field2863.field2868 = this.field2863;
        this.field2863.field2867 = this.field2863;
    }

    @ObfuscatedName("fz.k()V")
    public void method3309() {
        while (this.field2863.field2868 != this.field2863) {
            this.field2863.field2868.method3346();
        }
    }

    @ObfuscatedName("fz.y(Lgj;)V")
    public void method3310(class183 arg0) {
        if (arg0.field2867 != null) {
            arg0.method3346();
        }
        arg0.field2867 = this.field2863.field2867;
        arg0.field2868 = this.field2863;
        arg0.field2867.field2868 = arg0;
        arg0.field2868.field2867 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
