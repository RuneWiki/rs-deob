package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class200 implements Iterable {

    @ObfuscatedName("go.j")
    public class204 field3089 = new class204();

    public class200() {
        this.field3089.field3094 = this.field3089;
        this.field3089.field3093 = this.field3089;
    }

    @ObfuscatedName("go.j()V")
    public void method3633() {
        while (this.field3089.field3094 != this.field3089) {
            this.field3089.field3094.method3680();
        }
    }

    @ObfuscatedName("go.m(Lgx;)V")
    public void method3634(class204 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3680();
        }
        arg0.field3093 = this.field3089.field3093;
        arg0.field3094 = this.field3089;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
