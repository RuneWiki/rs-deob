package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pg")
public class class393 implements Iterator {

    @ObfuscatedName("pg.aw")
    public class394 field4453;

    @ObfuscatedName("pg.ay")
    public int field4455 = 0;

    @ObfuscatedName("pg.ar")
    public int field4454 = this.field4453.field4460;

    public class393(class394 arg0) {
        this.field4453 = arg0;
    }

    public boolean hasNext() {
        return this.field4455 < this.field4453.field4458;
    }

    public Object next() {
        if (this.field4453.field4460 != this.field4454) {
            throw new ConcurrentModificationException();
        } else if (this.field4455 < this.field4453.field4458) {
            Object var1 = this.field4453.field4456[this.field4455].field4451;
            this.field4455++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
