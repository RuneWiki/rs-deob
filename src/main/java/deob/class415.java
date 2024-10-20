package deob;

import java.util.Iterator;

@ObfuscatedName("pb")
public class class415 implements Iterator {

    @ObfuscatedName("pb.ap")
    public class416 field4734;

    @ObfuscatedName("pb.aw")
    public class511 field4735;

    @ObfuscatedName("pb.ak")
    public class511 field4736 = null;

    public class415(class416 arg0) {
        this.field4734 = arg0;
        this.field4735 = this.field4734.field4738.field5163;
        this.field4736 = null;
    }

    public Object next() {
        class511 var1 = this.field4735;
        if (this.field4734.field4738 == var1) {
            var1 = null;
            this.field4735 = null;
        } else {
            this.field4735 = var1.field5163;
        }
        this.field4736 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4734.field4738 != this.field4735;
    }

    public void remove() {
        if (this.field4736 == null) {
            throw new IllegalStateException();
        }
        this.field4736.method8665();
        this.field4736 = null;
    }
}
