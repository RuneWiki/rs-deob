package deob;

@ObfuscatedName("cu")
public class class54 extends class506 {

    @ObfuscatedName("cu.ab")
    public class48 field343;

    public class54() {
        this.field343 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field343 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field343 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cu.ab(I)Z")
    public boolean method987() {
        return this.field343 == null;
    }

    @ObfuscatedName("cu.ay(B)Lbq;")
    public class41 method985() {
        if (this.field343 == null || !this.field343.field311.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method983();
        } finally {
            this.field343.field311.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cu.an(I)Lbq;")
    public class41 method986() {
        if (this.field343 == null) {
            return null;
        }
        this.field343.field311.lock();
        class41 var1;
        try {
            var1 = this.method983();
        } finally {
            this.field343.field311.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cu.au(I)Lbq;")
    public class41 method983() {
        if (this.field343.field309 == null) {
            this.field343.field309 = this.field343.field310.method998((int[]) null);
            this.field343.field310 = null;
        }
        return this.field343.field309;
    }
}
