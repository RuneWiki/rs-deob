package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class201 implements Iterable {

    @ObfuscatedName("gn.s")
    public class205 field3111 = new class205();

    public class201() {
        this.field3111.field3115 = this.field3111;
        this.field3111.field3116 = this.field3111;
    }

    @ObfuscatedName("gn.s()V")
    public void method3587() {
        while (this.field3111.field3115 != this.field3111) {
            this.field3111.field3115.method3617();
        }
    }

    @ObfuscatedName("gn.j(Lgv;)V")
    public void method3582(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3617();
        }
        arg0.field3116 = this.field3111.field3116;
        arg0.field3115 = this.field3111;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
