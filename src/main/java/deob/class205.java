package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class205 implements Iterator {

    @ObfuscatedName("gl.h")
    public class202 field3093;

    @ObfuscatedName("gl.m")
    public class208 field3092;

    @ObfuscatedName("gl.i")
    public class208 field3094 = null;

    public class205(class202 arg0) {
        this.field3093 = arg0;
        this.field3092 = this.field3093.field3088.field3101;
        this.field3094 = null;
    }

    public Object next() {
        class208 var1 = this.field3092;
        if (this.field3093.field3088 == var1) {
            var1 = null;
            this.field3092 = null;
        } else {
            this.field3092 = var1.field3101;
        }
        this.field3094 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3093.field3088 != this.field3092;
    }

    public void remove() {
        if (this.field3094 == null) {
            throw new IllegalStateException();
        }
        this.field3094.method3625();
        this.field3094 = null;
    }
}
