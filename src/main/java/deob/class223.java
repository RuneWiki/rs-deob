package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class223 implements Iterator {

    @ObfuscatedName("hg.t")
    public class210 field2652;

    @ObfuscatedName("hg.q")
    public class217 field2650;

    @ObfuscatedName("hg.i")
    public int field2651;

    @ObfuscatedName("hg.a")
    public class217 field2649 = null;

    public class223(class210 arg0) {
        this.field2652 = arg0;
        this.method3780();
    }

    @ObfuscatedName("hg.b()V")
    public void method3780() {
        this.field2650 = this.field2652.field2612[0].field2637;
        this.field2651 = 1;
        this.field2649 = null;
    }

    public Object next() {
        if (this.field2652.field2612[this.field2651 - 1] != this.field2650) {
            class217 var1 = this.field2650;
            this.field2650 = var1.field2637;
            this.field2649 = var1;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2651 >= this.field2652.field2614) {
                return null;
            }
            var2 = this.field2652.field2612[this.field2651++].field2637;
        } while (this.field2652.field2612[this.field2651 - 1] == var2);
        this.field2650 = var2.field2637;
        this.field2649 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2652.field2612[this.field2651 - 1] != this.field2650) {
            return true;
        }
        while (this.field2651 < this.field2652.field2614) {
            if (this.field2652.field2612[this.field2651++].field2637 != this.field2652.field2612[this.field2651 - 1]) {
                this.field2650 = this.field2652.field2612[this.field2651 - 1].field2637;
                return true;
            }
            this.field2650 = this.field2652.field2612[this.field2651 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2649 == null) {
            throw new IllegalStateException();
        }
        this.field2649.method3721();
        this.field2649 = null;
    }
}
