package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class201 implements Iterable {

    @ObfuscatedName("gr.w")
    public class205 field3110 = new class205();

    public class201() {
        this.field3110.field3115 = this.field3110;
        this.field3110.field3114 = this.field3110;
    }

    @ObfuscatedName("gr.w()V")
    public void method3618() {
        while (this.field3110.field3115 != this.field3110) {
            this.field3110.field3115.method3658();
        }
    }

    @ObfuscatedName("gr.x(Lgs;)V")
    public void method3619(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3658();
        }
        arg0.field3114 = this.field3110.field3114;
        arg0.field3115 = this.field3110;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
