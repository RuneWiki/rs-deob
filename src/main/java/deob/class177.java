package deob;

import java.util.Iterator;

@ObfuscatedName("fc")
public class class177 implements Iterable {

    @ObfuscatedName("fc.e")
    public class180 field2833 = new class180();

    public class177() {
        this.field2833.field2836 = this.field2833;
        this.field2833.field2837 = this.field2833;
    }

    @ObfuscatedName("fc.e()V")
    public void method3261() {
        while (this.field2833.field2836 != this.field2833) {
            this.field2833.field2836.method3287();
        }
    }

    @ObfuscatedName("fc.p(Lfi;)V")
    public void method3263(class180 arg0) {
        if (arg0.field2837 != null) {
            arg0.method3287();
        }
        arg0.field2837 = this.field2833.field2837;
        arg0.field2836 = this.field2833;
        arg0.field2837.field2836 = arg0;
        arg0.field2836.field2837 = arg0;
    }

    public Iterator iterator() {
        return new class181(this);
    }
}
