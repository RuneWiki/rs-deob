package deob;

@ObfuscatedName("cf")
public class class54 extends class473 {

    @ObfuscatedName("cf.au")
    public class48 field387;

    public class54() {
        this.field387 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field387 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field387 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cf.au(B)Z")
    public boolean method1025() {
        return this.field387 == null;
    }

    @ObfuscatedName("cf.ae(I)Lbu;")
    public class41 method1036() {
        if (this.field387 == null || !this.field387.field350.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1022();
        } finally {
            this.field387.field350.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cf.ao(I)Lbu;")
    public class41 method1027() {
        if (this.field387 == null) {
            return null;
        }
        this.field387.field350.lock();
        class41 var1;
        try {
            var1 = this.method1022();
        } finally {
            this.field387.field350.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cf.at(I)Lbu;")
    public class41 method1022() {
        if (this.field387.field349 == null) {
            this.field387.field349 = this.field387.field355.method1045((int[]) null);
            this.field387.field355 = null;
        }
        return this.field387.field349;
    }
}
