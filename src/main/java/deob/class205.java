package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class205 implements Iterable {

    @ObfuscatedName("gh.w")
    public class198 field2508 = new class198();

    public class205() {
        this.field2508.field2493 = this.field2508;
        this.field2508.field2494 = this.field2508;
    }

    @ObfuscatedName("gh.w()V")
    public void method3379() {
        while (this.field2508.field2493 != this.field2508) {
            this.field2508.field2493.method3331();
        }
    }

    @ObfuscatedName("gh.o(Lgw;)V")
    public void method3372(class198 arg0) {
        if (arg0.field2494 != null) {
            arg0.method3331();
        }
        arg0.field2494 = this.field2508.field2494;
        arg0.field2493 = this.field2508;
        arg0.field2494.field2493 = arg0;
        arg0.field2493.field2494 = arg0;
    }

    public Iterator iterator() {
        return new class204(this);
    }
}
