package deob;

@ObfuscatedName("cb")
public class class54 extends class515 {

    @ObfuscatedName("cb.ap")
    public class48 field341;

    public class54() {
        this.field341 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field341 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field341 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cb.ap(I)Z")
    public boolean method1043() {
        return this.field341 == null;
    }

    @ObfuscatedName("cb.aw(I)Lbt;")
    public class41 method1044() {
        if (this.field341 == null || !this.field341.field305.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1046();
        } finally {
            this.field341.field305.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cb.ak(I)Lbt;")
    public class41 method1062() {
        if (this.field341 == null) {
            return null;
        }
        this.field341.field305.lock();
        class41 var1;
        try {
            var1 = this.method1046();
        } finally {
            this.field341.field305.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cb.aj(I)Lbt;")
    public class41 method1046() {
        if (this.field341.field304 == null) {
            this.field341.field304 = this.field341.field310.method1069((int[]) null);
            this.field341.field310 = null;
        }
        return this.field341.field304;
    }
}
