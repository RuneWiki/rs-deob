package deob;

@ObfuscatedName("hb")
public class class216 {

    @ObfuscatedName("hb.b")
    public class217 field2619 = new class217();

    @ObfuscatedName("hb.q")
    public class217 field2618;

    public class216() {
        this.field2619.field2620 = this.field2619;
        this.field2619.field2621 = this.field2619;
    }

    @ObfuscatedName("hb.b(Lhg;)V")
    public void method3770(class217 arg0) {
        if (arg0.field2621 != null) {
            arg0.method3780();
        }
        arg0.field2621 = this.field2619.field2621;
        arg0.field2620 = this.field2619;
        arg0.field2621.field2620 = arg0;
        arg0.field2620.field2621 = arg0;
    }

    @ObfuscatedName("hb.q()Lhg;")
    public class217 method3771() {
        class217 var1 = this.field2619.field2620;
        if (this.field2619 == var1) {
            this.field2618 = null;
            return null;
        } else {
            this.field2618 = var1.field2620;
            return var1;
        }
    }

    @ObfuscatedName("hb.o()Lhg;")
    public class217 method3772() {
        class217 var1 = this.field2618;
        if (this.field2619 == var1) {
            this.field2618 = null;
            return null;
        } else {
            this.field2618 = var1.field2620;
            return var1;
        }
    }
}
