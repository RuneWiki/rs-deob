package deob;

@ObfuscatedName("ch")
public class class54 extends class508 {

    @ObfuscatedName("ch.ac")
    public class48 field351;

    public class54() {
        this.field351 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field351 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field351 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("ch.ac(I)Z")
    public boolean method1027() {
        return this.field351 == null;
    }

    @ObfuscatedName("ch.ae(I)Lbg;")
    public class41 method1028() {
        if (this.field351 == null || !this.field351.field317.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1035();
        } finally {
            this.field351.field317.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ch.ag(I)Lbg;")
    public class41 method1029() {
        if (this.field351 == null) {
            return null;
        }
        this.field351.field317.lock();
        class41 var1;
        try {
            var1 = this.method1035();
        } finally {
            this.field351.field317.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ch.am(S)Lbg;")
    public class41 method1035() {
        if (this.field351.field319 == null) {
            this.field351.field319 = this.field351.field318.method1046((int[]) null);
            this.field351.field318 = null;
        }
        return this.field351.field319;
    }
}
