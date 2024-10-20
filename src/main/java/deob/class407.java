package deob;

import java.util.Iterator;

@ObfuscatedName("pw")
public class class407 implements Iterator {

    @ObfuscatedName("pw.ak")
    public class408 field4631;

    @ObfuscatedName("pw.al")
    public class504 field4632;

    @ObfuscatedName("pw.aj")
    public class504 field4633 = null;

    public class407(class408 arg0) {
        this.method6871(arg0);
    }

    @ObfuscatedName("pw.ak(Lps;)V")
    public void method6871(class408 arg0) {
        this.field4631 = arg0;
        this.method6867();
    }

    @ObfuscatedName("pw.al()V")
    public void method6867() {
        this.field4632 = this.field4631 == null ? null : this.field4631.field4634.field5048;
        this.field4633 = null;
    }

    public Object next() {
        class504 var1 = this.field4632;
        if (this.field4631.field4634 == var1) {
            var1 = null;
            this.field4632 = null;
        } else {
            this.field4632 = var1.field5048;
        }
        this.field4633 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4631.field4634 != this.field4632 && this.field4632 != null;
    }

    public void remove() {
        if (this.field4633 == null) {
            throw new IllegalStateException();
        }
        this.field4633.method8189();
        this.field4633 = null;
    }
}
