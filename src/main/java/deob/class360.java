package deob;

import java.util.Iterator;

@ObfuscatedName("nc")
public class class360 implements Iterator {

    @ObfuscatedName("nc.aj")
    public class361 field4321;

    @ObfuscatedName("nc.al")
    public class444 field4322;

    @ObfuscatedName("nc.ac")
    public class444 field4320 = null;

    public class360(class361 arg0) {
        this.method6121(arg0);
    }

    @ObfuscatedName("nc.aj(Lni;)V")
    public void method6121(class361 arg0) {
        this.field4321 = arg0;
        this.method6122();
    }

    @ObfuscatedName("nc.al()V")
    public void method6122() {
        this.field4322 = this.field4321 == null ? null : this.field4321.field4324.field4672;
        this.field4320 = null;
    }

    public Object next() {
        class444 var1 = this.field4322;
        if (this.field4321.field4324 == var1) {
            var1 = null;
            this.field4322 = null;
        } else {
            this.field4322 = var1.field4672;
        }
        this.field4320 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4321.field4324 != this.field4322 && this.field4322 != null;
    }

    public void remove() {
        if (this.field4320 == null) {
            throw new IllegalStateException();
        }
        this.field4320.method7335();
        this.field4320 = null;
    }
}
