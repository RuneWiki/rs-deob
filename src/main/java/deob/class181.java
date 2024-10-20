package deob;

import java.util.Iterator;

@ObfuscatedName("fr")
public class class181 implements Iterable {

    @ObfuscatedName("fr.l")
    public class185 field2871 = new class185();

    public class181() {
        this.field2871.field2876 = this.field2871;
        this.field2871.field2875 = this.field2871;
    }

    @ObfuscatedName("fr.l()V")
    public void method3316() {
        while (this.field2871.field2876 != this.field2871) {
            this.field2871.field2876.method3349();
        }
    }

    @ObfuscatedName("fr.y(Lgk;)V")
    public void method3317(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3349();
        }
        arg0.field2875 = this.field2871.field2875;
        arg0.field2876 = this.field2871;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    public Iterator iterator() {
        return new class187(this);
    }
}
