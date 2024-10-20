package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class205 implements Iterator {

    @ObfuscatedName("gz.d")
    public class194 field2576;

    @ObfuscatedName("gz.x")
    public class200 field2575;

    @ObfuscatedName("gz.k")
    public int field2577;

    @ObfuscatedName("gz.z")
    public class200 field2578 = null;

    public class205(class194 arg0) {
        this.field2576 = arg0;
        this.method3541();
    }

    @ObfuscatedName("gz.p()V")
    public void method3541() {
        this.field2575 = this.field2576.field2543[0].field2565;
        this.field2577 = 1;
        this.field2578 = null;
    }

    public Object next() {
        if (this.field2576.field2543[this.field2577 - 1] != this.field2575) {
            class200 var1 = this.field2575;
            this.field2575 = var1.field2565;
            this.field2578 = var1;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2577 >= this.field2576.field2546) {
                return null;
            }
            var2 = this.field2576.field2543[this.field2577++].field2565;
        } while (this.field2576.field2543[this.field2577 - 1] == var2);
        this.field2575 = var2.field2565;
        this.field2578 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2576.field2543[this.field2577 - 1] != this.field2575) {
            return true;
        }
        while (this.field2577 < this.field2576.field2546) {
            if (this.field2576.field2543[this.field2577++].field2565 != this.field2576.field2543[this.field2577 - 1]) {
                this.field2575 = this.field2576.field2543[this.field2577 - 1].field2565;
                return true;
            }
            this.field2575 = this.field2576.field2543[this.field2577 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2578 == null) {
            throw new IllegalStateException();
        }
        this.field2578.method3475();
        this.field2578 = null;
    }
}
