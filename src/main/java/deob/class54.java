package deob;

@ObfuscatedName("ch")
public class class54 extends class492 {

    @ObfuscatedName("ch.aq")
    public class48 field365;

    public class54() {
        this.field365 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field365 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field365 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("ch.aq(I)Z")
    public boolean method996() {
        return this.field365 == null;
    }

    @ObfuscatedName("ch.aw(B)Lbr;")
    public class41 method990() {
        if (this.field365 == null || !this.field365.field331.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method987();
        } finally {
            this.field365.field331.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ch.al(I)Lbr;")
    public class41 method997() {
        if (this.field365 == null) {
            return null;
        }
        this.field365.field331.lock();
        class41 var1;
        try {
            var1 = this.method987();
        } finally {
            this.field365.field331.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ch.ai(B)Lbr;")
    public class41 method987() {
        if (this.field365.field330 == null) {
            this.field365.field330 = this.field365.field329.method1006((int[]) null);
            this.field365.field329 = null;
        }
        return this.field365.field330;
    }
}
