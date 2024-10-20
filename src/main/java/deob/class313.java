package deob;

import java.util.Iterator;

@ObfuscatedName("lk")
public class class313 implements Iterator {

    @ObfuscatedName("lk.n")
    public class314 field3827;

    @ObfuscatedName("lk.c")
    public class364 field3826;

    @ObfuscatedName("lk.m")
    public class364 field3828 = null;

    public class313(class314 arg0) {
        this.field3827 = arg0;
        this.field3826 = this.field3827.field3830.field4049;
        this.field3828 = null;
    }

    public Object next() {
        class364 var1 = this.field3826;
        if (this.field3827.field3830 == var1) {
            var1 = null;
            this.field3826 = null;
        } else {
            this.field3826 = var1.field4049;
        }
        this.field3828 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3827.field3830 != this.field3826;
    }

    public void remove() {
        if (this.field3828 == null) {
            throw new IllegalStateException();
        }
        this.field3828.method5728();
        this.field3828 = null;
    }
}
