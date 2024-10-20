package deob;

import java.util.Iterator;

@ObfuscatedName("po")
public class class395 implements Iterable {

    @ObfuscatedName("po.at")
    public class481 field4449 = new class481();

    @ObfuscatedName("po.ah")
    public class481 field4448;

    public class395() {
        this.field4449.field4842 = this.field4449;
        this.field4449.field4844 = this.field4449;
    }

    @ObfuscatedName("po.at()V")
    public void method6706() {
        while (this.field4449.field4842 != this.field4449) {
            this.field4449.field4842.method7825();
        }
    }

    @ObfuscatedName("po.ah(Lsn;)V")
    public void method6696(class481 arg0) {
        if (arg0.field4844 != null) {
            arg0.method7825();
        }
        arg0.field4844 = this.field4449.field4844;
        arg0.field4842 = this.field4449;
        arg0.field4844.field4842 = arg0;
        arg0.field4842.field4844 = arg0;
    }

    @ObfuscatedName("po.ar(Lsn;Lsn;)V")
    public static void method6697(class481 arg0, class481 arg1) {
        if (arg0.field4844 != null) {
            arg0.method7825();
        }
        arg0.field4844 = arg1;
        arg0.field4842 = arg1.field4842;
        arg0.field4844.field4842 = arg0;
        arg0.field4842.field4844 = arg0;
    }

    @ObfuscatedName("po.ao()Lsn;")
    public class481 method6698() {
        class481 var1 = this.field4449.field4842;
        if (this.field4449 == var1) {
            return null;
        } else {
            var1.method7825();
            return var1;
        }
    }

    @ObfuscatedName("po.ab()Lsn;")
    public class481 method6699() {
        return this.method6707((class481) null);
    }

    @ObfuscatedName("po.au(Lsn;)Lsn;")
    public class481 method6707(class481 arg0) {
        class481 var2;
        if (arg0 == null) {
            var2 = this.field4449.field4842;
        } else {
            var2 = arg0;
        }
        if (this.field4449 == var2) {
            this.field4448 = null;
            return null;
        } else {
            this.field4448 = var2.field4842;
            return var2;
        }
    }

    @ObfuscatedName("po.aa()Lsn;")
    public class481 method6701() {
        class481 var1 = this.field4448;
        if (this.field4449 == var1) {
            this.field4448 = null;
            return null;
        } else {
            this.field4448 = var1.field4842;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class394(this);
    }
}
