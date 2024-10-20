package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class186 implements Iterator {

    @ObfuscatedName("go.x")
    public class183 field2874;

    @ObfuscatedName("go.v")
    public class189 field2873;

    @ObfuscatedName("go.m")
    public class189 field2872 = null;

    public class186(class183 arg0) {
        this.field2874 = arg0;
        this.field2873 = this.field2874.field2868.field2881;
        this.field2872 = null;
    }

    public Object next() {
        class189 var1 = this.field2873;
        if (this.field2874.field2868 == var1) {
            var1 = null;
            this.field2873 = null;
        } else {
            this.field2873 = var1.field2881;
        }
        this.field2872 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2874.field2868 != this.field2873;
    }

    public void remove() {
        if (this.field2872 == null) {
            throw new IllegalStateException();
        }
        this.field2872.method3352();
        this.field2872 = null;
    }
}
