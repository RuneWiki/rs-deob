package deob;

@ObfuscatedName("cg")
public class class54 extends class485 {

    @ObfuscatedName("cg.at")
    public class48 field352;

    public class54() {
        this.field352 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field352 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field352 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cg.at(I)Z")
    public boolean method1015() {
        return this.field352 == null;
    }

    @ObfuscatedName("cg.ah(I)Lbt;")
    public class41 method1014() {
        if (this.field352 == null || !this.field352.field317.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1016();
        } finally {
            this.field352.field317.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cg.ar(I)Lbt;")
    public class41 method1013() {
        if (this.field352 == null) {
            return null;
        }
        this.field352.field317.lock();
        class41 var1;
        try {
            var1 = this.method1016();
        } finally {
            this.field352.field317.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cg.ao(I)Lbt;")
    public class41 method1016() {
        if (this.field352.field318 == null) {
            this.field352.field318 = this.field352.field316.method1032((int[]) null);
            this.field352.field316 = null;
        }
        return this.field352.field318;
    }
}
